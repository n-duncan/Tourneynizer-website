ALTER TABLE matches DROP COLUMN child1_id;
ALTER TABLE matches DROP COLUMN child2_id;

ALTER TABLE matches ADD COLUMN round SMALLINT NOT NULL;
