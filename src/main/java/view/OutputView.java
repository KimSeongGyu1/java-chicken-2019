package view;

import domain.Menu;
import domain.OrderStorage;
import domain.Table;

import java.util.List;

public class OutputView {
	private static final String TOP_LINE = "┌ ─ ┐";
	private static final String TABLE_FORMAT = "| %s |";

	public static void showBlankLine() {
		System.out.println();
	}
	
	public static void showMain() {
		System.out.println("## 메인화면\n" 
				+ "1 - 주문등록\n" 
				+ "2 - 결제하기\n" 
				+ "3 - 프로그램 종료\n");
	}

	public static void printTables(final List<Table> tables) {
		System.out.println("## 테이블 목록");
		final int size = tables.size();
		printLine(TOP_LINE, size);
		printTableNumbers(tables);
		for (Table table: tables) {
			System.out.print(table.convertStateToSTring());
		}
		System.out.println();
	}

	public static void printMenus(final List<Menu> menus) {
		for (final Menu menu : menus) {
			System.out.println(menu);
		}
	}

	private static void printLine(final String line, final int count) {
		for (int index = 0; index < count; index++) {
			System.out.print(line);
		}
		System.out.println();
	}

	private static void printTableNumbers(final List<Table> tables) {
		for (final Table table : tables) {
			System.out.printf(TABLE_FORMAT, table);
		}
		System.out.println();
	}
	
	public static void printOrders(OrderStorage orderStorage) {
		System.out.println("##주문 내역\n" 
				+ orderStorage.toString());
	}
	
	public static void printFinalPrice(int price) {
		System.out.println("##최종 결제할 금액\n"
				+ price + "원");
	}
}