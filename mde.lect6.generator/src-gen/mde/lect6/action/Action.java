
package mde.lect6.action;

import java.util.*;

public class Action {

	private static Hashtable<String, Integer> table = new Hashtable<String, Integer>();

	private void fib1() {
		fib2();
	}

	private void fib2() {
		res();
	}

	private void res() {
		counter();
	}

	private void counter() {
		number();
	}

	private void number() {
		init_fib1();
	}

	private static void initialize() {

		if (table.containsKey("a")) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			table.put("a", 0);

		if (table.containsKey("b")) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			table.put("b", 0);

		if (table.containsKey("r")) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			table.put("r", 0);

		if (table.containsKey("n")) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			table.put("n", 0);

		if (table.containsKey("fn")) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else
			table.put("fn", 0);

	}

	private void end() {

		System.out.println(table.get("a"));

		System.out.println(table.get("b"));

		System.out.println(table.get("r"));

		System.out.println(table.get("n"));

		System.out.println(table.get("fn"));

	}

	private void init_fib1() {
		if (table.containsKey("a")) {
			table.put("a", 0);
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		init_fib2();
	}

	private void init_fib2() {
		if (table.containsKey("b")) {
			table.put("b", 1);
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		init_counter();
	}

	private void init_counter() {
		if (table.containsKey("n")) {
			table.put("n", 1);
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		init_number();
	}

	private void init_number() {
		if (table.containsKey("fn")) {
			table.put("fn", 7);
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		init_result();
	}

	private void init_result() {
		if (table.containsKey("r")) {
			table.put("r", 1);
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		check();
	}

	private void iterate() {
		if (table.containsKey("a")) {
			table.put("a", table.get("b"));
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		iterate1();
	}

	private void iterate1() {
		if (table.containsKey("b")) {
			table.put("b", table.get("r"));
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		iterate2();
	}

	private void iterate2() {
		if (table.containsKey("r")) {
			table.put("r", table.get("a") + table.get("b"));
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		iterate3();
	}

	private void iterate3() {
		if (table.containsKey("n")) {
			table.put("n", table.get("n") + 1);
		} else {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		check();
	}

	public void start() {
		fib1();
	}

	private void check() {
		if (table.get("n") < table.get("fn"))
			iterate();
		else
			end();
	}

	public static void main(String[] args) {
		initialize();
		(new Action()).start();
	}
}
