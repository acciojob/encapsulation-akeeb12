package com.driver;

import com.driver.RWOnly;

public class Main {
  public static void main (String[] args)
  {
      RWOnly rwOnlyObj = new RWOnly();

      rwOnlyObj.setName("Akeeb MM");
      System.out.println("Name:" + rwOnlyObj.getName());
  }
}