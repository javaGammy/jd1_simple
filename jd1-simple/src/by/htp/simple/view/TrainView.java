package by.htp.simple.view;

import java.util.List;

import by.htp.simple.bean.Train;

public class TrainView {

	public void print(Train train) {
		System.out.print("TRAIN: number" + train.getNumber() + "\n\t" + train.getDestinationStation() + "\n" + train.getDate() + "\n");
	}

	public void print(List<Train> trains) {
		for (Train train : trains) {
			print(train);
		}

	}

}
