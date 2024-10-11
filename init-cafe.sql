CREATE TABLE public.cafe
(
	    id serial NOT NULL,
	    type character varying NOT NULL,
	    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.cafe
    OWNER to postgres;
