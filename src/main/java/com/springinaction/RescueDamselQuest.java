package com.springinaction;

import com.springinaction.exception.QuestException;
import com.springinaction.quests.Quest;

public class RescueDamselQuest implements Quest {
  public void embark() throws QuestException {
    System.out.println("Rescuing damsel in distress");
  }
}
