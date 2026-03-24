-- Migrations to add gender column to members table

ALTER TABLE tb_members
ADD COLUMN gender VARCHAR(255);
