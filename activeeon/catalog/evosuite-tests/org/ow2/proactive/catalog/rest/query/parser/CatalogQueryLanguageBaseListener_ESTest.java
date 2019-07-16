/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 16 12:59:12 GMT 2019
 */

package org.ow2.proactive.catalog.rest.query.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import graphql.parser.antlr.GraphqlParser;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.ow2.proactive.catalog.rest.query.parser.CatalogQueryLanguageBaseListener;
import org.ow2.proactive.catalog.rest.query.parser.CatalogQueryLanguageParser;

public class CatalogQueryLanguageBaseListener_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.ClauseContext catalogQueryLanguageParser_ClauseContext0 = new CatalogQueryLanguageParser.ClauseContext();
      CatalogQueryLanguageParser.AtomicClauseContext catalogQueryLanguageParser_AtomicClauseContext0 = new CatalogQueryLanguageParser.AtomicClauseContext(catalogQueryLanguageParser_ClauseContext0);
      catalogQueryLanguageBaseListener0.enterAtomicClause(catalogQueryLanguageParser_AtomicClauseContext0);
      assertTrue(catalogQueryLanguageParser_AtomicClauseContext0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.ExpressionContext catalogQueryLanguageParser_ExpressionContext0 = new CatalogQueryLanguageParser.ExpressionContext();
      CatalogQueryLanguageParser.AndExpressionContext catalogQueryLanguageParser_AndExpressionContext0 = new CatalogQueryLanguageParser.AndExpressionContext(catalogQueryLanguageParser_ExpressionContext0);
      GraphqlParser.ValueContext graphqlParser_ValueContext0 = new GraphqlParser.ValueContext(catalogQueryLanguageParser_AndExpressionContext0, (-1465));
      GraphqlParser.ObjectFieldWithVariableContext graphqlParser_ObjectFieldWithVariableContext0 = new GraphqlParser.ObjectFieldWithVariableContext(graphqlParser_ValueContext0, (-1465));
      catalogQueryLanguageBaseListener0.exitEveryRule(graphqlParser_ObjectFieldWithVariableContext0);
      assertEquals(0, graphqlParser_ObjectFieldWithVariableContext0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      catalogQueryLanguageBaseListener0.exitClauseExpression((CatalogQueryLanguageParser.ClauseExpressionContext) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.KeyValueClauseContext catalogQueryLanguageParser_KeyValueClauseContext0 = mock(CatalogQueryLanguageParser.KeyValueClauseContext.class, new ViolatedAssumptionAnswer());
      catalogQueryLanguageBaseListener0.exitKeyValueClause(catalogQueryLanguageParser_KeyValueClauseContext0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      catalogQueryLanguageBaseListener0.visitTerminal((TerminalNode) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.ExpressionContext catalogQueryLanguageParser_ExpressionContext0 = mock(CatalogQueryLanguageParser.ExpressionContext.class, new ViolatedAssumptionAnswer());
      CatalogQueryLanguageParser.AndExpressionContext catalogQueryLanguageParser_AndExpressionContext0 = new CatalogQueryLanguageParser.AndExpressionContext(catalogQueryLanguageParser_ExpressionContext0);
      catalogQueryLanguageBaseListener0.enterAndExpression(catalogQueryLanguageParser_AndExpressionContext0);
      assertEquals(1, catalogQueryLanguageParser_AndExpressionContext0.depth());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      catalogQueryLanguageBaseListener0.exitStart((CatalogQueryLanguageParser.StartContext) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CommonToken commonToken0 = new CommonToken(1401);
      ErrorNodeImpl errorNodeImpl0 = new ErrorNodeImpl(commonToken0);
      catalogQueryLanguageBaseListener0.visitErrorNode(errorNodeImpl0);
      assertEquals(0, errorNodeImpl0.getChildCount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.AndExpressionContext catalogQueryLanguageParser_AndExpressionContext0 = mock(CatalogQueryLanguageParser.AndExpressionContext.class, new ViolatedAssumptionAnswer());
      catalogQueryLanguageBaseListener0.exitAndExpression(catalogQueryLanguageParser_AndExpressionContext0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.ExpressionContext catalogQueryLanguageParser_ExpressionContext0 = new CatalogQueryLanguageParser.ExpressionContext();
      CatalogQueryLanguageParser.OrExpressionContext catalogQueryLanguageParser_OrExpressionContext0 = new CatalogQueryLanguageParser.OrExpressionContext(catalogQueryLanguageParser_ExpressionContext0);
      GraphqlParser.SchemaDefinitionContext graphqlParser_SchemaDefinitionContext0 = new GraphqlParser.SchemaDefinitionContext(catalogQueryLanguageParser_OrExpressionContext0, 670);
      CatalogQueryLanguageParser.StartContext catalogQueryLanguageParser_StartContext0 = new CatalogQueryLanguageParser.StartContext(graphqlParser_SchemaDefinitionContext0, 2072);
      catalogQueryLanguageBaseListener0.enterStart(catalogQueryLanguageParser_StartContext0);
      assertEquals(0, catalogQueryLanguageParser_StartContext0.getRuleIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.ExpressionContext catalogQueryLanguageParser_ExpressionContext0 = mock(CatalogQueryLanguageParser.ExpressionContext.class, new ViolatedAssumptionAnswer());
      CatalogQueryLanguageParser.AndExpressionContext catalogQueryLanguageParser_AndExpressionContext0 = new CatalogQueryLanguageParser.AndExpressionContext(catalogQueryLanguageParser_ExpressionContext0);
      CatalogQueryLanguageParser.OrExpressionContext catalogQueryLanguageParser_OrExpressionContext0 = new CatalogQueryLanguageParser.OrExpressionContext(catalogQueryLanguageParser_AndExpressionContext0);
      catalogQueryLanguageBaseListener0.exitOrExpression(catalogQueryLanguageParser_OrExpressionContext0);
      assertEquals(1, catalogQueryLanguageParser_OrExpressionContext0.depth());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.ClauseContext catalogQueryLanguageParser_ClauseContext0 = mock(CatalogQueryLanguageParser.ClauseContext.class, new ViolatedAssumptionAnswer());
      CatalogQueryLanguageParser.KeyValueClauseContext catalogQueryLanguageParser_KeyValueClauseContext0 = new CatalogQueryLanguageParser.KeyValueClauseContext(catalogQueryLanguageParser_ClauseContext0);
      catalogQueryLanguageBaseListener0.enterKeyValueClause(catalogQueryLanguageParser_KeyValueClauseContext0);
      assertEquals(0, catalogQueryLanguageParser_KeyValueClauseContext0.invokingState);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      catalogQueryLanguageBaseListener0.enterClauseExpression((CatalogQueryLanguageParser.ClauseExpressionContext) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      catalogQueryLanguageBaseListener0.exitAtomicClause((CatalogQueryLanguageParser.AtomicClauseContext) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      CatalogQueryLanguageParser.ExpressionContext catalogQueryLanguageParser_ExpressionContext0 = new CatalogQueryLanguageParser.ExpressionContext();
      CatalogQueryLanguageParser.OrExpressionContext catalogQueryLanguageParser_OrExpressionContext0 = new CatalogQueryLanguageParser.OrExpressionContext(catalogQueryLanguageParser_ExpressionContext0);
      catalogQueryLanguageBaseListener0.enterOrExpression(catalogQueryLanguageParser_OrExpressionContext0);
      assertEquals(1, catalogQueryLanguageParser_OrExpressionContext0.getRuleIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CatalogQueryLanguageBaseListener catalogQueryLanguageBaseListener0 = new CatalogQueryLanguageBaseListener();
      catalogQueryLanguageBaseListener0.enterEveryRule((ParserRuleContext) null);
  }
}
