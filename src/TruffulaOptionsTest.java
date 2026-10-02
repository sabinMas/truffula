import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class TruffulaOptionsTest {

  @Test
  void testValidDirectoryIsSet(@TempDir File tempDir) throws FileNotFoundException {
    // Arrange: Prepare the arguments with the temp directory
    File directory = new File(tempDir, "subfolder");
    directory.mkdir();
    String directoryPath = directory.getAbsolutePath();
    String[] args = {"-nc", "-h", directoryPath};

    // Act: Create TruffulaOptions instance
    TruffulaOptions options = new TruffulaOptions(args);

    // Assert: Check that the root directory is set correctly
    assertEquals(directory.getAbsolutePath(), options.getRoot().getAbsolutePath());
    assertTrue(options.isShowHidden());
    assertFalse(options.isUseColor());
  }

  @Test 
  void testHiddenFlag(@TempDir File tempDir)
    throws FileNotFoundException {
      //Arrange create a temp directory and include the hidden file reference -h
      String[] args = {"-h", tempDir.getAbsolutePath()};
    // Act parse through the argument 
    TruffulaOptions options = new TruffulaOptions(args);
    // Assert verify hidden files is enabled but color stays default
    assertTrue(options.isShowHidden());
    assertTrue(options.isUseColor());
}

  @Test
  void testNoColorFlagDisablesColor(@TempDir File tempDir)
          throws FileNotFoundException {
      // Arrange include only the no color flag and a temp dir
      String[] args = {"-nc", tempDir.getAbsolutePath()};
      // Act parse arguments
      TruffulaOptions options = new TruffulaOptions(args);
      // Assert make sure color is disabled and hidden remains disabled by default
      assertFalse(options.isShowHidden());
      assertFalse(options.isUseColor());
  }
  
}
