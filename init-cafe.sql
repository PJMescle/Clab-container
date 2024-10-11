CREATE TABLE IF NOT EXISTS public.cafe
(
    id integer NOT NULL DEFAULT nextval('"cafe_Id_seq"'::regclass),
    type character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "Id" PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cafe
    OWNER to postgres;