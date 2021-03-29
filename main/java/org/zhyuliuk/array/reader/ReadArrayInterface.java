package org.zhyuliuk.array.reader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface ReadArrayInterface {
  public ArrayList<String> readInList(String pathname) throws IOException;

}
