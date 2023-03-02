package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[2];

		intput(std);
		print(std);
		System.out.println("-----------------");
		System.out.println("Mảng sinh viên theo thứ tự điểm trung bình tăng dần");
		sapXep(std);
		print(std);
	}

	private static void sapXep(Student[] std) {
		// TODO Auto-generated method stub
		for (int i = 0; i < std.length; i++) {
			for (int j = 0; j < std.length; j++) {
				if (std[i].getDiemTrungBinh() > std[j].getDiemTrungBinh()) {
					Student temp = std[j];
					std[j] = std[i];
					std[i] = temp;
				}
			}
		}
	}

	private static void print(Student[] std) {
		// TODO Auto-generated method stub
		for (int i = 0; i < std.length; i++) {
			System.out.println("Sinh viên " + (i + 1));
			System.out.println("Tên : " + std[i].getName());
			System.out.println("Tuổi :" + std[i].getOld());
			System.out.println("Địa chỉ : " + std[i].getAddress());
			System.out.println("Số điện thoại :" + std[i].getPhone());
			System.out.println("Điểm TB :" + std[i].getDiemTrungBinh());

			System.out.println();
		}
	}

	private static void intput(Student[] std) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < std.length; i++) {
			System.out.println("Nhập sinh viên " + (i + 1));
			System.out.println("Tên : ");
			String name = sc.nextLine();
			System.out.println("Tuổi :");
			int old = sc.nextInt();
			System.out.println("Địa chỉ :");
			String address = sc.nextLine();
			System.out.println("Số điện thoại :");
			String phone = sc.nextLine();
			System.out.println("Điểm trung bình :");
			double diemTrungBinh = sc.nextDouble();

			std[i] = new Student(name, old, address, phone, diemTrungBinh);
		}
		sc.close();

	}

}
