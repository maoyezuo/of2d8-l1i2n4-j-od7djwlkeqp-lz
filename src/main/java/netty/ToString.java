package netty;


public class ToString {
	/**
	 * 打印多个字符
	 * 
	 * @param str
	 *            ...
	 */
	public static void println(Object... obj) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(Thread.currentThread().getStackTrace()[2].getClassName());
		sb.append(" ");
		sb.append(Thread.currentThread().getStackTrace()[2].getLineNumber());
		sb.append("]");
		for (int i = 0; i < obj.length; i++) {
			sb.append(obj[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	//java8 Arrays.stream( wincards ).boxed().toArray( Integer[]::new )
	public static void printlnArray(Object[] objs) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(Thread.currentThread().getStackTrace()[2].getClassName());
		sb.append(" ");
		sb.append(Thread.currentThread().getStackTrace()[2].getLineNumber());
		sb.append("]");
		for (Object obj:objs) {
			sb.append(obj);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	
	public static void printlnArray(int[] objs, Object... obj2) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append(Thread.currentThread().getStackTrace()[2].getClassName());
		sb.append(" ");
		sb.append(Thread.currentThread().getStackTrace()[2].getLineNumber());
		sb.append("]");
		for (Object obj:objs) {
			sb.append(obj);
			sb.append(" ");
		}
		for (Object obj:obj2) {
			sb.append(obj);
			sb.append(" ");
		}
		System.out.println(sb.toString());
	}
	
	public static String printlnClass(Object... obj) {
		StringBuffer sb = new StringBuffer();
		sb.append("[i-");
		sb.append(Thread.currentThread().getStackTrace()[2].getClassName());
		sb.append(" ");
		sb.append(Thread.currentThread().getStackTrace()[2].getLineNumber());
		sb.append("]");
		for (int i = 0; i < obj.length; i++) {
			sb.append(obj[i]);
			sb.append(" ");
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	

	/**
	 * 打印枚举switch
	 * 
	 * @param winTypes
	 */

	public static void makeEnumSwitch(Enum<?>[] enums) {
		ToString.println("------------------------------打印枚举switch---------------------------------------");
		ToString.println("    switch (key) {");
		for (Enum<?> type : enums) {
			ToString.println("      case ", type.name(), ":");
			ToString.println();
			ToString.println("        break;");
		}
		ToString.println("      default:");
		ToString.println("        break;");
		ToString.println("    }");
	}
	
	public static void makeEnumSwitchInt2Type(Enum<?>[] enums) {
		ToString.println("------------------------------typeid---------------------------------------");
		ToString.println("    switch (type) {");
		int num = 1;
		for (Enum<?> type : enums) {
			ToString.println("      case", num, ":");
			ToString.println("      wintype =", type.name(), ";");
			ToString.println("        break;");
			num++;
		}
		ToString.println("      default:");
		ToString.println("        break;");
		ToString.println("    }");
	}

}
