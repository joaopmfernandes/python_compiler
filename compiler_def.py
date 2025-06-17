if "." in __name__:
    from .PythonParser import PythonParser
    from .PythonParserVisitor import PythonParserVisitor
else:
    from PythonParser import PythonParser
    from PythonParserVisitor import PythonParserVisitor

class Compiler(PythonParserVisitor):

    def __init__(self):
        super(Compiler, self).__init__()
        self.vars = {}
        return None
    
    # Paste here all methods in PythonParserVisitor.py file
# Visit a parse tree produced by PythonParser#code.
    def visitCode(self, ctx:PythonParser.CodeContext):
        print(('Benvindo ao visitcode', ctx.getText(), type(ctx))) 
        return self.visitChildren(ctx)
    

    # Visit a parse tree produced by PythonParser#stat.
    def visitStat(self, ctx:PythonParser.StatContext):
        print(('Benvindo ao visitStat', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)
    

    # Visit a parse tree produced by PythonParser#conditional.
    def visitConditional(self, ctx:PythonParser.ConditionalContext):
        print(('Benvindo ao visitConditional', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)
    

    # Visit a parse tree produced by PythonParser#loop_while.
    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        print(('Benvindo ao visitLoop_while', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)
   

    # Visit a parse tree produced by PythonParser#if_elif_else.
    def visitIf_elif_else(self, ctx:PythonParser.If_elif_elseContext):
        print(('Benvindo ao visitIf_elif_else', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)
     

    # Visit a parse tree produced by PythonParser#func.
    def visitFunc(self, ctx:PythonParser.FuncContext):
        print(('Benvindo ao visitFunc', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)
    

    # Visit a parse tree produced by PythonParser#func_call.
    def visitFunc_call(self, ctx:PythonParser.Func_callContext):
        print(('Benvindo ao visitFunc_call', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)
     

    # Visit a parse tree produced by PythonParser#expr.
    def visitExpr(self, ctx:PythonParser.ExprContext):
        print(('Benvindo ao visitExpr', ctx.getText(), type(ctx)))
        
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#query.
    def visitQuery(self, ctx:PythonParser.QueryContext):
        print(('Benvindo ao visitQuery', ctx.getText(), type(ctx))) 
        return self.visitChildren(ctx)
    
del (PythonParser, PythonParserVisitor)
