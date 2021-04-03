package ladder.domain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrizeResult {

  private final Map<User, Prize> prizeResult = new HashMap<>();

  public void put(User user,Prize prize) {
    prizeResult.put(user,prize);
  }

  public Map<User,Prize> getResult() {
    return prizeResult;
  }
}
