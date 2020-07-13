// This file is autogenerated -- probably shouldn't modify it by hand

package bindings.sdl_ni_generated;

import bindings.sdl_structs.ISDL_Surface;
import clobits.all_targets.IWrapperNI;

public class WrapSDL_Surface implements ISDL_Surface, IWrapperNI {
  SDL_Surface pointer;

  // used when sending data to native functions
  public SDL_Surface unwrap() {
    return this.pointer;
  }

  public bindings.sdl_ni_generated.WrapSDL_PixelFormat format() {
    return new bindings.sdl_ni_generated.WrapSDL_PixelFormat(this.pointer.format());
  }

  public void set_format(bindings.sdl_ni_generated.WrapSDL_PixelFormat v) {
    this.pointer.set_format(v.unwrap());
  }

  public void set_format(bindings.sdl_structs.ISDL_PixelFormat v) {
    this.pointer.set_format(v);
  }

  public WrapSDL_Surface(SDL_Surface pointer) {
    this.pointer = pointer;
  }
}
