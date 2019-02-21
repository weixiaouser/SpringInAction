package com.springinaction.quests;

import com.springinaction.exception.QuestException;

public interface Quest {
  void embark() throws QuestException;
}
