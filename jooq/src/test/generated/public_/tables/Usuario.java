/**
 * This class is generated by jOOQ
 */
package test.generated.public_.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Usuario extends org.jooq.impl.UpdatableTableImpl<test.generated.public_.tables.records.UsuarioRecord> {

	private static final long serialVersionUID = 1770122916;

	/**
	 * The singleton instance of public.usuario
	 */
	public static final test.generated.public_.tables.Usuario USUARIO = new test.generated.public_.tables.Usuario();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<test.generated.public_.tables.records.UsuarioRecord> getRecordType() {
		return test.generated.public_.tables.records.UsuarioRecord.class;
	}

	/**
	 * The table column <code>public.usuario.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.UsuarioRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>public.usuario.datadecadastro</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.UsuarioRecord, java.sql.Date> DATADECADASTRO = createField("datadecadastro", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>public.usuario.email</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.UsuarioRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>public.usuario.foto</code>
	 */
	public final org.jooq.TableField<test.generated.public_.tables.records.UsuarioRecord, java.lang.Long> FOTO = createField("foto", org.jooq.impl.SQLDataType.BIGINT, this);

	public Usuario() {
		super("usuario", test.generated.public_.Public.PUBLIC);
	}

	public Usuario(java.lang.String alias) {
		super(alias, test.generated.public_.Public.PUBLIC, test.generated.public_.tables.Usuario.USUARIO);
	}

	@Override
	public org.jooq.UniqueKey<test.generated.public_.tables.records.UsuarioRecord> getMainKey() {
		return test.generated.public_.Keys.USUARIO_PKEY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<test.generated.public_.tables.records.UsuarioRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<test.generated.public_.tables.records.UsuarioRecord>>asList(test.generated.public_.Keys.USUARIO_PKEY, test.generated.public_.Keys.USUARIO_EMAIL_KEY);
	}

	@Override
	public test.generated.public_.tables.Usuario as(java.lang.String alias) {
		return new test.generated.public_.tables.Usuario(alias);
	}
}
