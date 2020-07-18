// This file is autogenerated -- probably shouldn't modify it by hand

package clobits.sdl.ni;

import clobits.sdl.Surface;
import clobits.wrappers.IWrapperNI;

public class SurfaceWrapper implements Surface, IWrapperNI {
  ISurface pointer;

  // used when sending data to native functions
  public ISurface unwrap() {
    return this.pointer;
  }

  public clobits.sdl.ni.PixelFormatWrapper format() {
    return new clobits.sdl.ni.PixelFormatWrapper(this.pointer.format());
  }

  public void set_format(clobits.sdl.ni.PixelFormatWrapper v) {
    this.pointer.set_format(v.unwrap());
  }

  public void set_format(clobits.sdl.PixelFormat v) {
    this.pointer.set_format(v);
  }

  public SurfaceWrapper(ISurface pointer) {
    this.pointer = pointer;
  }
}
