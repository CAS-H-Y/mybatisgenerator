package com.heyang.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.mybatis3.MyBatis3FormattingUtilities;
import org.mybatis.generator.config.Context;

import java.util.List;

public class PaginationPlugin extends PluginAdapter {
    /**
     * 生成dao
     */
    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("BaseDao<" + introspectedTable.getBaseRecordType() + ">");
        FullyQualifiedJavaType imp = new FullyQualifiedJavaType("com.heyang.common.BaseDao");
        FullyQualifiedJavaType impMapper = new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper");
        interfaze.addSuperInterface(fqjt);
        //添加 extends BaseDao<User>
        interfaze.addImportedType(imp);
        //添加import common.BaseDao;
        interfaze.addAnnotation("@Mapper");
        interfaze.addImportedType(impMapper);
        interfaze.getMethods().clear();
        return true;
    }


    /**
     * * 生成实体中每个属性
     */
    @Override
    public boolean modelGetterMethodGenerated(
            Method method,
            TopLevelClass topLevelClass,
            IntrospectedColumn introspectedColumn,
            IntrospectedTable introspectedTable,
            ModelClassType modelClassType) {
        return true;
    }

    /**
     * 生成实体
     */
    @Override
    public boolean modelBaseRecordClassGenerated(
            TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        addSerialVersionUID(topLevelClass, introspectedTable);
        return super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);
    }

    /**
     * 生成mapping
     */
    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        return super.sqlMapGenerated(sqlMap, introspectedTable);
    }

    /**
     * 生成mapping 添加自定义sql
     */
    @Override
    public boolean sqlMapDocumentGenerated(Document document, IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();
        List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
        XmlElement parentElement = document.getRootElement();
        XmlElement sql = new XmlElement("sql");
        sql.addAttribute(new Attribute("id", "Base_Column_List"));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<columns.size();i++){
            if(i!=0){
                sb.append(",");
            }
            sb.append(columns.get(i).getActualColumnName());
        }
        sql.addElement(new TextElement(sb.toString()));
        //sql.addElement(getColum(columns));
        XmlElement get = new XmlElement("select");
        get.addAttribute(new Attribute("id", "get"));
        get.addAttribute(new Attribute("resultMap", "BaseResultMap"));
        get.addAttribute(new Attribute("parameterType", "String"));
        String selectsql="select ";
        get.addElement(new TextElement(selectsql));
        XmlElement include = new XmlElement("include");
        include.addAttribute(new Attribute("refid", "Base_Column_List"));
        get.addElement(include);
        List<IntrospectedColumn> list= introspectedTable.getPrimaryKeyColumns();

        get.addElement(new TextElement(getPrimaryKeyColumns(list)));
        parentElement.addElement(sql);
        parentElement.addElement(get);
        return super.sqlMapDocumentGenerated(document, introspectedTable);

    }
    private String getPrimaryKeyColumns(List<IntrospectedColumn> list){
        StringBuilder sb=new StringBuilder();
        sb.append(" where ");
        for(int i=0;i<list.size();i++){
            if(i!=0){
                sb.append(" and ");
            }
            String cloumName=list.get(i).getActualColumnName();
            String cloumType=list.get(i).getJdbcTypeName();
            sb.append(cloumName+"={"+cloumName+",jdbcType="+cloumType+"}");
        }
        return sb.toString();
    }
    private String getColum(List<IntrospectedColumn> columns){
        StringBuilder sb = new StringBuilder();
        XmlElement where = new XmlElement("where");
        for (IntrospectedColumn column : columns) {
            XmlElement isNotNullElement = new XmlElement("if");
            sb.setLength(0);
            sb.append(column.getJavaProperty());
            sb.append(" != null"); //$NON-NLS-1$
            isNotNullElement.addAttribute(new Attribute("test", sb.toString())); //$NON-NLS-1$
            where.addElement(isNotNullElement);
            sb.setLength(0);
            sb.append(" and ");
            sb.append(MyBatis3FormattingUtilities.getEscapedColumnName(column));
            sb.append(" = "); //$NON-NLS-1$

            sb.append(MyBatis3FormattingUtilities.getParameterClause(column));
            isNotNullElement.addElement(new TextElement(sb.toString()));
        }
        return sb.toString();
    }
    @Override
    public boolean sqlMapUpdateByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return false;
    }

    public PaginationPlugin() {
        super();
    }

    @Override
    public boolean sqlMapResultMapWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return super.sqlMapResultMapWithoutBLOBsElementGenerated(element,introspectedTable);
    }

    @Override
    public boolean sqlMapCountByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapDeleteByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapResultMapWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeyWithBLOBsElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
//        String tableName = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();
//        //数据库表名
//        List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
//        element.addAttribute(new Attribute("id", "find"));
//        element.getAttributes();
//        element.addAttribute(new Attribute("resultMap", "BaseResultMap"));
//        element.addAttribute(new Attribute("parameterType", introspectedTable.getBaseRecordType()));
//        element.addElement(new TextElement(" select"));
//        XmlElement include = new XmlElement("include");
//        include.addAttribute(new Attribute("refid", "Base_Column_List"));
//        element.addElement(include);
//
//        element.addElement(new TextElement("* from"  + introspectedTable.getFullyQualifiedTableNameAtRuntime()));
//        String text="where "+introspectedTable.getGeneratedKey();
//        TextElement where = new TextElement(text);
//        element.addElement(where);
//        return super.sqlMapSelectByPrimaryKeyElementGenerated(element, introspectedTable);
        return false;
    }

    @Override
    public boolean sqlMapInsertElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public Context getContext() {
        return super.getContext();
    }

    @Override
    public boolean sqlMapBaseColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapBlobColumnListElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectAllElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable
            introspectedTable) {

        return false;
    }

    /**
     * mapping中添加方法
     */
    public boolean sqlMapDocumentGenerated2(Document document, IntrospectedTable introspectedTable) {
        String tableName = introspectedTable.getAliasedFullyQualifiedTableNameAtRuntime();
        //数据库表名
        List<IntrospectedColumn> columns = introspectedTable.getAllColumns();
        //添加sql
        XmlElement sql = new XmlElement("select");
        XmlElement parentElement = document.getRootElement();
        XmlElement deleteLogicByIdsElement = new XmlElement("update");
        deleteLogicByIdsElement.addAttribute(new Attribute("id", "deleteLogicByIds"));
        deleteLogicByIdsElement.addElement(new TextElement("update " + tableName + " set deleteFlag = #{deleteFlag,jdbcType=INTEGER} where id in " + " <foreach item=\"item\" index=\"index\" collection=\"ids\" open=\"(\" separator=\",\" close=\")\">#{item}</foreach> "));
        parentElement.addElement(deleteLogicByIdsElement);
        XmlElement queryPage = new XmlElement("select");
        queryPage.addAttribute(new Attribute("id", "queryPage"));
        queryPage.addAttribute(new Attribute("resultMap", "BaseResultMap"));
        queryPage.addElement(new TextElement("select "));
        XmlElement include = new XmlElement("include");
        include.addAttribute(new Attribute("refid", "Base_Column_List"));
        queryPage.addElement(include);
        queryPage.addElement(new TextElement(" from " + tableName + " ${sql}"));
        parentElement.addElement(queryPage);
        return super.sqlMapDocumentGenerated(document, introspectedTable);
    }

    private void addSerialVersionUID(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        CommentGenerator commentGenerator = context.getCommentGenerator();
        Field field = new Field();
        field.setVisibility(JavaVisibility.PRIVATE);
        field.setType(new FullyQualifiedJavaType("long"));
        field.setStatic(true);
        field.setFinal(true);
        field.setName("serialVersionUID");
        field.setInitializationString("1L");
        commentGenerator.addFieldComment(field, introspectedTable);
        topLevelClass.addField(field);
    }
    /*	 * Dao中添加方法	 */

    private Method generateDeleteLogicByIds(Method method, IntrospectedTable introspectedTable) {
        Method m = new Method("deleteLogicByIds");
        m.setVisibility(method.getVisibility());
        m.setReturnType(FullyQualifiedJavaType.getIntInstance());
        m.addParameter(new Parameter(FullyQualifiedJavaType.getIntInstance(), "deleteFlag", "@Param(\"deleteFlag\")"));
        m.addParameter(new Parameter(new FullyQualifiedJavaType("Integer[]"), "ids", "@Param(\"ids\")"));
        context.getCommentGenerator().addGeneralMethodComment(m, introspectedTable);
        return m;
    }    /*	 * 实体中添加属性	 */

    private void addLimit(TopLevelClass topLevelClass, IntrospectedTable introspectedTable, String name) {
        CommentGenerator commentGenerator = context.getCommentGenerator();
        Field field = new Field();
        field.setVisibility(JavaVisibility.PROTECTED);
        field.setType(FullyQualifiedJavaType.getIntInstance());
        field.setName(name);
        field.setInitializationString("-1");
        commentGenerator.addFieldComment(field, introspectedTable);
        topLevelClass.addField(field);
        char c = name.charAt(0);
        String camel = Character.toUpperCase(c) + name.substring(1);
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setName("set" + camel);
        method.addParameter(new Parameter(FullyQualifiedJavaType.getIntInstance(), name));
        method.addBodyLine("this." + name + "=" + name + ";");
        commentGenerator.addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);
        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getIntInstance());
        method.setName("get" + camel);
        method.addBodyLine("return " + name + ";");
        commentGenerator.addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);
    }

    public boolean validate(List<String> arg0) {
        return true;
    }

    public static void generate() {
        String config = PaginationPlugin.class.getClassLoader().getResource("generatorConfig.xml").getFile();
        String[] arg = {"-configfile", config, "-overwrite"};
        ShellRunner.main(arg);
    }

    public static void main(String[] args) {
        generate();
    }
}