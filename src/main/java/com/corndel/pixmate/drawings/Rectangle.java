package com.corndel.pixmate.drawings;

import com.github.tomaslanger.chalk.Chalk;

public class Rectangle {
  public static void main(String[] args) {
    draw();
  }

  public static void draw() {
    int width = 5;
    int height = 10;

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < height; j++) {
        System.out.print(Chalk.on("*").yellow());
      }
      System.out.println();
    }
  }
}