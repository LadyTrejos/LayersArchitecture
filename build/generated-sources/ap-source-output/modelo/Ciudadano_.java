package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ciudadano.class)
public abstract class Ciudadano_ {

	public static volatile ListAttribute<Ciudadano, Libro> libros;
	public static volatile SingularAttribute<Ciudadano, Integer> cedula;
	public static volatile SingularAttribute<Ciudadano, String> apellido;
	public static volatile SingularAttribute<Ciudadano, String> nombre;

}

