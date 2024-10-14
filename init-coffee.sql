CREATE TABLE public.coffee
(
	    id serial NOT NULL,
	    type character varying NOT NULL,
	    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.coffee
    OWNER to postgres;
