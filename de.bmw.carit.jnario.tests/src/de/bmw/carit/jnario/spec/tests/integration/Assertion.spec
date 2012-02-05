package de.bmw.carit.jnario.spec.tests.integration

import org.eclipse.xtext.xbase.lib.Procedures$Procedure1
import org.junit.Assert
/**
 * Jnario provides assertions on steroids.
 */
describe "Assertion"{
	
	"passes if the evaluated expression is true"{
		assert true
		assert 1 == 1
	}
	
	"fails if the evaluated expression is false"{
		expect(typeof(AssertionError))[assert false]
	} 

	/*
	 * Assertions are selfexplainable.
	 */
	context "prints all expression values"{
		
		/*
		 * If the assertion fails, will print the value of all referenced variables.
		 */
		"Variable Access"{ 
			val y = false
			errorMessage[assert y].is(  
			'''
			Expected y but:
			     y is false''')
		}                           
		
		/*
		 * Literal values will not be printed.
		 */               
		"Filters literals"{           
			val x = 0  
			errorMessage[assert x == 42].is(  
			'''
			Expected x == 42 but:
			     x is 0''')	 
		}      
		
		"Not Equals"{           
			val x = 42     
			errorMessage[assert !(x == 42)].is(  
			'''
			Expected !(x == 42) but:
			     x == 42 is true
			     x is 42''')	  
		}   
		     
		"Function Calls"{
			errorMessage[assert greet("World") == "Hello World!"].is(  
			'''
			Expected greet("World") == "Hello World!" but:
			     greet("World") is "Hello World"''')
		}      
		
		"And expressions"{
			val x = 0 
			val y = 1
			errorMessage[assert x == 1 && y == 0].is(  
			'''
			Expected x == 1 && y == 0 but:
			     x == 1 is false
			     x is 0
			     y == 0 is false
			     y is 1''')
		}    
  
 		"Removes duplicate feature calls"{
 			val x = 0 
			errorMessage[assert x > 0 && x < 10].is(  
			'''
			Expected x > 0 && x < 10 but:
			     x > 0 is false
			     x is 0
			     x < 10 is true''')
 		}
   
		def greet(String name){
			return "Hello " + name
		}		   
	}      
	 
	def is(String actual, CharSequence expected){
		Assert::assertEquals(expected.toString().replaceAll("\r", ""), actual.replaceAll("\r", ""))
	}
 
	def String errorMessage(Procedures$Procedure1<Boolean> proc){
		try{ 
			proc.apply(null)
			throw new AssertionError("expected AssertionError")
		}catch(AssertionError e){
			return e.message.trim 
		}
	} 
}                                