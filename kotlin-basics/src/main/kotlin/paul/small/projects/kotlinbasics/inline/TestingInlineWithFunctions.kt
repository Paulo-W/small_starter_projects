package paul.small.projects.kotlinbasics.inline

fun main() {
//	multiplyByTwo(5) {
//		println("Result is: $it")
//	}
	multiplyByTwoInline(5) {
		println("Result is: $it")
	}
}

fun multiplyByTwo(num: Int, lambda: (result: Int) -> Unit): Int {
	val result = num * 2
	lambda(result)
	return result
}

inline fun multiplyByTwoInline(num: Int, lambda: (result: Int) -> Unit): Int {
	val result = num * 2
	lambda(result)
	return result
}


/*=================================================
Decompiled code using multiplyBy2:
   public static final void main() {
      multiplyByTwo(5, (Function1)null.INSTANCE);
   }

   //Function1 is a type of function from Kotlins.jvm.functions package
   //representing a functions that takes in one parameter in this case INT
   public static final int multiplyByTwo(int num, @NotNull Function1 lambda) {
      Intrinsics.checkParameterIsNotNull(lambda, "lambda");
      int result = num * 2;
      lambda.invoke(result);
      return result;
   }
*/
//================================================
/*================================================
Decompiled code using multiplyBy2Inline:
   public static final void main() {
      int num$iv = 5;
      int result$iv = num$iv * 2;
      String var5 = "Result is: " + result$iv;
      System.out.println(var5);
   }

   // No instance of Function1 was created.. Avoid creating unnecessary objects
   public static final int multiplyByTwoInline(int num, @NotNull Function1 lambda) {
      int $i$f$multiplyByTwoInline = 0;
      Intrinsics.checkParameterIsNotNull(lambda, "lambda");
      int result = num * 2;
      lambda.invoke(result);
      return result;
   }
*/
//================================================