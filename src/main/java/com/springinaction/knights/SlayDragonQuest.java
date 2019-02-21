package com.springinaction.knights;

import com.springinaction.exception.QuestException;
import com.springinaction.quests.Quest;

public class SlayDragonQuest implements Quest {

  public void embark() throws QuestException {
    System.out.println("Slaying Dragon!");
  }

}
