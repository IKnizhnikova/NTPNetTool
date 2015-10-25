// Generated from CTL.g4 by ANTLR 4.2.1

  //package ltlpnmodelchecker.ltl;
package algorithms.ctlparser;

import java.util.HashSet;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import algorithms.CTLformula.AtomicPredicate;
import algorithms.CTLformula.CTLFormula;
import algorithms.CTLformula.Operators;

/**
 * This class provides an empty implementation of {@link CTLListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CTLBaseListener implements CTLListener {
	//TODO brackets' translation
	public Stack<CTLFormula> predicates=new Stack<CTLFormula>();
	public HashSet<String> atomic=new HashSet<String>();
	public String st="\ngraph G{\r\n";
	public CTLFormula getFormula(){
		return predicates.pop();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAp(@NotNull CTLParser.ApContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAp(@NotNull CTLParser.ApContext ctx) {
		predicates.push(new CTLFormula(new AtomicPredicate(ctx.AP().getText())));
		st+="\r\n"+ctx.AP().getText();
		if(!atomic.contains(ctx.AP().getText())){
			atomic.add(ctx.AP().getText());
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStart(@NotNull CTLParser.StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStart(@NotNull CTLParser.StartContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterNOT(@NotNull CTLParser.NOTContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNOT(@NotNull CTLParser.NOTContext ctx) {
		st+="\r\n\"!("+predicates.peek().getSymbolic()+")\"";
		st+="\r\n\""+predicates.peek().getSymbolic()+"\"--\"!("+predicates.peek().getSymbolic()+")\"";
		CTLFormula f=predicates.pop();
		predicates.push(new CTLFormula(Operators.NOT, f, "!"+f.getSymbolic()));
		
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAND(@NotNull CTLParser.ANDContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAND(@NotNull CTLParser.ANDContext ctx) {
		
		CTLFormula s=predicates.pop();
		CTLFormula f=predicates.pop();
		st+="\r\n\"("+f.getSymbolic()+")&("+s.getSymbolic()+")\"";
		st+="\r\n\""+f.getSymbolic()+"\"--\"("+f.getSymbolic()+"&"+s.getSymbolic()+")\"";
		st+="\r\n\""+s.getSymbolic()+"\"--\"("+f.getSymbolic()+"&"+s.getSymbolic()+")\"";
		CTLFormula t1=new CTLFormula(Operators.NOT, f,"!("+f.getSymbolic()+")");
		CTLFormula t2=new CTLFormula(Operators.NOT, s,"!("+s.getSymbolic()+")");
		t1=new CTLFormula(Operators.OR, t1,t2,"("+t1.getSymbolic()+")|("+t2.getSymbolic()+")");
		predicates.push(new CTLFormula(Operators.NOT, t1,"!("+t1.getSymbolic()+")"));		
		//predicates.push(new CTLFormula(Operators.AND, f,s,f.getSymbolic()+"&"+s.getSymbolic()));		
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFalse(@NotNull CTLParser.FalseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFalse(@NotNull CTLParser.FalseContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTrue(@NotNull CTLParser.TrueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTrue(@NotNull CTLParser.TrueContext ctx) {
		predicates.push(new CTLFormula(new AtomicPredicate("1")));
		st+="\r\n1";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPare(@NotNull CTLParser.PareContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPare(@NotNull CTLParser.PareContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterORorIMPL(@NotNull CTLParser.ORorIMPLContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitORorIMPL(@NotNull CTLParser.ORorIMPLContext ctx) {
		CTLFormula s=predicates.pop();
		CTLFormula f=predicates.pop();
		st+="\r\n\"("+f.getSymbolic()+")"+ctx.getChild(1).getText()+"("+s.getSymbolic()+")\"";
		st+="\r\n\""+f.getSymbolic()+"\"--\"("+f.getSymbolic()+")"+ctx.getChild(1).getText()+"("+s.getSymbolic()+")\"";
	    st+="\r\n\""+s.getSymbolic()+"\"--\"("+f.getSymbolic()+")"+ctx.getChild(1).getText()+"("+s.getSymbolic()+")\"";
//		if(ctx.getChild(1).getText().equals("|")){
//			st+="\r\n\""+f.getSymbolic()+"|"+s.getSymbolic()+"\"";
//			st+="\r\n\""+(f.getSymbolic())+"\"--\""+f.getSymbolic()+"|"+s.getSymbolic()+"\"";
//		st+="\r\n\""+(s.getSymbolic())+"\"--\""+f.getSymbolic()+"|"+s.getSymbolic()+"\"";
//		predicates.push(new CTLFormula(Operators.OR, f,s,f.getSymbolic()+"|"+s.getSymbolic()));
//		}
//		else{
//			st+="\r\n\""+f.getSymbolic()+"=>"+s.getSymbolic()+"\"";
//			st+="\r\n\""+(f.getSymbolic())+"\"--\""+f.getSymbolic()+"=>"+s.getSymbolic()+"\"";
//			st+="\r\n\""+(s.getSymbolic())+"\"--\""+f.getSymbolic()+"=>"+s.getSymbolic()+"\"";
//			CTLFormula t1=new CTLFormula(Operators.NOT, f,"!("+f.getSymbolic()+")");
//			t1=new CTLFormula(Operators.OR, t1,s,"("+t1.getSymbolic()+")|("+s.getSymbolic()+")");
//			predicates.push(new CTLFormula(Operators.NOT, t1,"!("+t1.getSymbolic()+")"));
//			//predicates.push(new CTLFormula(Operators.IMPL, f,s,f.getSymbolic()+"=>"+s.getSymbolic()));
//		}
			predicates.push(new CTLFormula(Operators.fromStr(ctx.getChild(1).getText()), f,s,
					"("+f.getSymbolic()+")"+ctx.getChild(1).getText()+"("+s.getSymbolic()+")"));
			
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAEXGF(@NotNull CTLParser.AEXGFContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAEXGF(@NotNull CTLParser.AEXGFContext ctx) { 
		CTLFormula f=predicates.pop();
		predicates.push(new CTLFormula(Operators.fromStr(ctx.getChild(0).getText()+ctx.getChild(1).getText()), 
				f,ctx.getChild(0).getText()+ctx.getChild(1).getText()+f.getSymbolic()));
		st+="\r\n\""+ctx.getChild(0).getText()+ctx.getChild(1).getText()+"("+f.getSymbolic()+")\"";
		st+="\r\n\""+ctx.getChild(0).getText()+ctx.getChild(1).getText()+"("+f.getSymbolic()+")\"--\""+f.getSymbolic()+"\"";
		//predicates.push(new CTLFormula(Operators.fromStr(ctx.getChild(1).getText()), f));
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEAU(@NotNull CTLParser.EAUContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEAU(@NotNull CTLParser.EAUContext ctx) { 
		CTLFormula s=predicates.pop();
		CTLFormula f=predicates.pop();
		predicates.push(new CTLFormula(Operators.fromStr(ctx.getChild(0).getText()), f,Operators.U,s, 
				ctx.getChild(0).getText()+f.getSymbolic()+"U"+s.getSymbolic()));
		st+="\r\n\""+ctx.getChild(0).getText()+"(("+f.getSymbolic()+")U("+s.getSymbolic()+"))\"";
		st+="\r\n\""+ctx.getChild(0).getText()+"(("+f.getSymbolic()+")U("+s.getSymbolic()+"))\"--\""+f.getSymbolic()+"\"";
		st+="\r\n\""+ctx.getChild(0).getText()+"(("+f.getSymbolic()+")U("+s.getSymbolic()+"))\"--\""+s.getSymbolic()+"\"";
		}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(@NotNull ParserRuleContext ctx) {
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(@NotNull ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(@NotNull TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(@NotNull ErrorNode node) { }
}