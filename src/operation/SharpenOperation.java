package operation;

import operable.FilterOperable;

/**
 * A class that represents sharpening operations on images.
 */
public class SharpenOperation implements Operation {
  private FilterOperable filterOperable;

  /** Construct a sharpening operation on a given FilterOperable.
   *
   * @param filterOperable the FilterOperable to operate
   */
  public SharpenOperation(FilterOperable filterOperable) {
    this.filterOperable = filterOperable;
  }

  /**
   * Perform the operation.
   */
  @Override
  public void perform() {

  }
}
