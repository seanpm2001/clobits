// This file is autogenerated -- probably shouldn't modify it by hand

package bindings.sdl_ni_generated;

import bindings.sdl_structs.ISDL_PixelFormat;
import clobits.all_targets.IWrapperNI;

public class WrapSDL_PixelFormat implements ISDL_PixelFormat, IWrapperNI {
  SDL_PixelFormat pointer;

  // used when sending data to native functions
  public SDL_PixelFormat unwrap() {
    return this.pointer;
  }

  public clobits.wrappers.WrapVoid palette() {
    return new clobits.wrappers.WrapVoid(this.pointer.palette());
  }

  public void set_palette(clobits.wrappers.WrapVoid v) {
    this.pointer.set_palette(v.unwrap());
  }

  public void set_palette(clobits.all_targets.IVoidPointerYE v) {
    this.pointer.set_palette(v);
  }

  public WrapSDL_PixelFormat(SDL_PixelFormat pointer) {
    this.pointer = pointer;
  }
}
