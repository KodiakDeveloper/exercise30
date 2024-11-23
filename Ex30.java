package selectionStructures;

import javax.swing.JOptionPane;

public class Ex30 {

	public static void main(String[] args) {

		String courseName, student;

		Double n1, n2, n3, n4, media_n, finalExam, directedStudy, mediaFinal;

		courseName = JOptionPane.showInputDialog(null, "Input course name: ");

		student = JOptionPane.showInputDialog(null, "Input student name: ");

		if (courseName.equals("") || student.equals("")) {

			JOptionPane.showMessageDialog(null, "Please input valid data!!");

			return;

		} else {

			student = student.toLowerCase().trim();

			courseName = courseName.toLowerCase().trim();

			JOptionPane.showMessageDialog(null, "Student: " + student + "\nCourse Name: " + courseName);
		}

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Input first grade: "));

		n2 = Double.parseDouble(JOptionPane.showInputDialog("Input second grade: "));

		n3 = Double.parseDouble(JOptionPane.showInputDialog("Input third grade: "));

		n4 = Double.parseDouble(JOptionPane.showInputDialog("Input fourth grade: "));

		if (n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0) {

			JOptionPane.showMessageDialog(null, "Only zero or positive values are available!!");

			return;
		}

		finalExam = Double.parseDouble(JOptionPane.showInputDialog("Input final exam grade : "));

		directedStudy = Double.parseDouble(JOptionPane.showInputDialog("Input directed study grade : "));

		media_n = (n1 + n2 + n3 + n4) / 4;

		media_n *= 0.2;

		mediaFinal = media_n + (finalExam * 0.6) + (directedStudy * 0.2);

		JOptionPane.showMessageDialog(null,
				"GRADES:\n" + "n1: " + n1 + "\nn2: " + n2 + "\nn3: " + n3 + "\nn4: " + n4 + "\n" + "Final Exam (PR): "
						+ finalExam + "\nDirected Study (ED): " + directedStudy + "\n" + "media_n: "
						+ String.format("%.2f", media_n) + "\n" + "Student Name: " + student + "\nCourse Name: "
						+ courseName);

		if (mediaFinal >= 6.0) {

			JOptionPane.showMessageDialog(null, "The student passed");

		} else {

			JOptionPane.showMessageDialog(null, "The student failed");
		}
	}
}
