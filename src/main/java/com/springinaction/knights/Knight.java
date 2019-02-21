package com.springinaction.knights;

import com.springinaction.exception.QuestException;

public interface Knight {
  void embarkOnQuest() throws QuestException;
}
