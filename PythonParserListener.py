# Generated from PythonParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .PythonParser import PythonParser
else:
    from PythonParser import PythonParser

# This class defines a complete listener for a parse tree produced by PythonParser.
class PythonParserListener(ParseTreeListener):

    # Enter a parse tree produced by PythonParser#code.
    def enterCode(self, ctx:PythonParser.CodeContext):
        pass

    # Exit a parse tree produced by PythonParser#code.
    def exitCode(self, ctx:PythonParser.CodeContext):
        pass


    # Enter a parse tree produced by PythonParser#stat.
    def enterStat(self, ctx:PythonParser.StatContext):
        pass

    # Exit a parse tree produced by PythonParser#stat.
    def exitStat(self, ctx:PythonParser.StatContext):
        pass


    # Enter a parse tree produced by PythonParser#conditional.
    def enterConditional(self, ctx:PythonParser.ConditionalContext):
        pass

    # Exit a parse tree produced by PythonParser#conditional.
    def exitConditional(self, ctx:PythonParser.ConditionalContext):
        pass


    # Enter a parse tree produced by PythonParser#loop_for.
    def enterLoop_for(self, ctx:PythonParser.Loop_forContext):
        pass

    # Exit a parse tree produced by PythonParser#loop_for.
    def exitLoop_for(self, ctx:PythonParser.Loop_forContext):
        pass


    # Enter a parse tree produced by PythonParser#loop_while.
    def enterLoop_while(self, ctx:PythonParser.Loop_whileContext):
        pass

    # Exit a parse tree produced by PythonParser#loop_while.
    def exitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        pass


    # Enter a parse tree produced by PythonParser#if_elif_else.
    def enterIf_elif_else(self, ctx:PythonParser.If_elif_elseContext):
        pass

    # Exit a parse tree produced by PythonParser#if_elif_else.
    def exitIf_elif_else(self, ctx:PythonParser.If_elif_elseContext):
        pass


    # Enter a parse tree produced by PythonParser#func.
    def enterFunc(self, ctx:PythonParser.FuncContext):
        pass

    # Exit a parse tree produced by PythonParser#func.
    def exitFunc(self, ctx:PythonParser.FuncContext):
        pass


    # Enter a parse tree produced by PythonParser#func_call.
    def enterFunc_call(self, ctx:PythonParser.Func_callContext):
        pass

    # Exit a parse tree produced by PythonParser#func_call.
    def exitFunc_call(self, ctx:PythonParser.Func_callContext):
        pass


    # Enter a parse tree produced by PythonParser#expr.
    def enterExpr(self, ctx:PythonParser.ExprContext):
        pass

    # Exit a parse tree produced by PythonParser#expr.
    def exitExpr(self, ctx:PythonParser.ExprContext):
        pass


    # Enter a parse tree produced by PythonParser#query.
    def enterQuery(self, ctx:PythonParser.QueryContext):
        pass

    # Exit a parse tree produced by PythonParser#query.
    def exitQuery(self, ctx:PythonParser.QueryContext):
        pass



del PythonParser