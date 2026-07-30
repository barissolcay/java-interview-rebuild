CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE goals(
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT NOT NULL REFERENCES users(id),
    title VARCHAR(200) NOT NULL,
    target_value NUMERIC(10, 2) NOT NULL,
    status VARCHAR(20) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE challenges(
    id BIGSERIAL PRIMARY KEY,
    creator_id BIGINT NOT NULL REFERENCES users(id),
    title VARCHAR(200) NOT NULL,
    status VARCHAR(20) NOT NULL,
    start_date DATE,
    end_date DATE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE challenge_participants(
    id BIGSERIAL PRIMARY KEY,
    challenge_id BIGINT NOT NULL REFERENCES challenges(id),
    user_id BIGINT NOT NULL REFERENCES users(id),
    joined_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    UNIQUE (challenge_id, user_id)
);

CREATE TABLE progress_entries(
    id BIGSERIAL PRIMARY KEY,
    challenge_id BIGINT NOT NULL REFERENCES challenges(id),
    user_id BIGINT NOT NULL REFERENCES users(id),
    progress_value NUMERIC(10, 2) NOT NULL,
    recorded_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);



-- SELECT kolonlar
-- FROM tablo
-- WHERE koşullar;


--İlk sorgu: Kullanıcının aktif hedefleri
SELECT *
FROM goals
WHERE user_id = 1
    AND status = 'ACTIVE'
ORDER BY created_at DESC;


--İkinci sorgu: Bir challenge’ın katılımcıları (10)
SELECT
    u.id,
    u.username,
    cp.joined_at
FROM challenge_participants cp
JOIN users u
    ON cp.user_id = u.id
WHERE cp.challenge_id = 10
ORDER BY cp.joined_at ASC;  --ASC eskiden yeniye sıralar, küçükten büyüğe, A dan Z ye.


--Üçüncü sorgu: bir kullanıcının toplam ilerlemesi
SELECT SUM(progress_value) AS total_progress
FROM progress_entries
WHERE user_id = 1;


--Dördüncü sorgu: En yüksek ilerlemeye sahip ilk beş kullanıcı
SELECT
    u.id,
    u.username,
    SUM(pe.progress_value) AS total_progress
FROM progress_entries pe
JOIN users u
    on pe.user_id = u.id
GROUP BY
    u.id,
    u.username
ORDER BY total_progress DESC
LIMIT 5;