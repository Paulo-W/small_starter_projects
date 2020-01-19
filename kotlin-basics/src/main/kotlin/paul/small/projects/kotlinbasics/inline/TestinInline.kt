package paul.small.projects.kotlinbasics.inline


/**
 * Testing the Kotlin o java decompiler steps:
 * Open tools in the navbar -> Kotlin -> show Kotlin byt code -> Hit decompile
 *
 */



fun main() {
//	multiplyByTwo(5)
	multiplyByTwoInline(5)
}

fun multiplyByTwo(num: Int): Int {
	return num * 2
}

inline fun multiplyByTwoInline(num: Int): Int {
	return num * 2
}

/*=================================================
Decompiled code using multiplyBy2:
   public static void main(String[] var0) {
	  main();
   }

   public static final int multiplyByTwo(int num) {
      return num * 2;
   }
*/
//================================================
/*================================================
Decompiled code using multiplyBy2Inline:
   public static final void main() {
      int num$iv = 5;
      int $i$f$multiplyByTwoInline = false;
      int var10000 = num$iv * 2;
   }
*/
//================================================
