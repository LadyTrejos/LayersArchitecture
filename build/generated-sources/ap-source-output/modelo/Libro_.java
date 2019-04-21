package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Libro.class)
public abstract class Libro_ {

	public static volatile SingularAttribute<Libro, Integer> num_paginas;
	public static volatile SingularAttribute<Libro, String> ISBN;
	public static volatile SingularAttribute<Libro, String> titulo;
	public static volatile ListAttribute<Libro, Ciudadano> ciudadanos;
	public static volatile SingularAttribute<Libro, Integer> num_ejemplares;
	public static volatile SingularAttribute<Libro, String> autor;

}

