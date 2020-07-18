;; This file is autogenerated by clobits -- probably shouldn't modify it by hand
(clojure.core/ns
 clobits.sdl.poly
 (:require [clojure.java.io] [clobits.wrappers] [clobits.sdl.structs])
 (:import
  org.graalvm.polyglot.Context
  org.graalvm.polyglot.Source
  org.graalvm.polyglot.Value)
 (:gen-class))

(def ^{:private true} empty-array (clojure.core/object-array 0))

(clojure.core/defn
 context-f
 []
 (clojure.core/->
  (org.graalvm.polyglot.Context/newBuilder
   (clojure.core/into-array ["llvm"]))
  (.allowAllAccess true)
  (.build)))

(clojure.core/defn
 ^{:private true}
 source-f
 []
 (clojure.core/->
  (org.graalvm.polyglot.Source/newBuilder
   "llvm"
   (if
    (clojure.core/string? "libs/libclobits$sdl.so")
    (clojure.java.io/file "libs/libclobits$sdl.so")
    "libs/libclobits$sdl.so"))
  (.build)))

(def polyglot-context (context-f))

(def polyglot-lib (.eval polyglot-context (source-f)))

(clojure.core/defn
 wrap-pointer
 [value]
 (clojure.core/reify clobits.wrappers.IWrapper (unwrap [_] value)))

(clojure.core/declare
 wrap-event
 wrap-keyboardevent
 wrap-keysym
 wrap-pixelformat
 wrap-rect
 wrap-surface)

(clojure.core/defn
 wrap-event
 [value]
 (clojure.core/reify
  clobits.sdl.Event
  (type [_] (.asInt (.getMember value "type")))
  (set_type [_ v] (.putMember value "type" v))
  (key [_] (wrap-keyboardevent (.getMember value "key")))
  (set_key [_ v] (.putMember value "key" (.unwrap v)))
  clobits.wrappers.IWrapper
  (unwrap [_] (.as value clobits.sdl.Event))))

(clojure.core/defn
 wrap-keyboardevent
 [value]
 (clojure.core/reify
  clobits.sdl.KeyboardEvent
  (keysym [_] (wrap-keysym (.getMember value "keysym")))
  (set_keysym [_ v] (.putMember value "keysym" (.unwrap v)))
  clobits.wrappers.IWrapper
  (unwrap [_] (.as value clobits.sdl.KeyboardEvent))))

(clojure.core/defn
 wrap-keysym
 [value]
 (clojure.core/reify
  clobits.sdl.Keysym
  (sym [_] (.asInt (.getMember value "sym")))
  (set_sym [_ v] (.putMember value "sym" v))
  clobits.wrappers.IWrapper
  (unwrap [_] (.as value clobits.sdl.Keysym))))

(clojure.core/defn
 wrap-pixelformat
 [value]
 (clojure.core/reify
  clobits.sdl.PixelFormat
  (palette [_] (wrap-pointer (.getMember value "palette")))
  (set_palette [_ v] (.putMember value "palette" (.unwrap v)))
  clobits.wrappers.IWrapper
  (unwrap [_] (.as value clobits.sdl.PixelFormat))))

(clojure.core/defn
 wrap-rect
 [value]
 (clojure.core/reify
  clobits.sdl.Rect
  (x [_] (.asInt (.getMember value "x")))
  (set_x [_ v] (.putMember value "x" v))
  (y [_] (.asInt (.getMember value "y")))
  (set_y [_ v] (.putMember value "y" v))
  (w [_] (.asInt (.getMember value "w")))
  (set_w [_ v] (.putMember value "w" v))
  (h [_] (.asInt (.getMember value "h")))
  (set_h [_ v] (.putMember value "h" v))
  clobits.wrappers.IWrapper
  (unwrap [_] (.as value clobits.sdl.Rect))))

(clojure.core/defn
 wrap-surface
 [value]
 (clojure.core/reify
  clobits.sdl.Surface
  (format [_] (wrap-pixelformat (.getMember value "format")))
  (set_format [_ v] (.putMember value "format" (.unwrap v)))
  clobits.wrappers.IWrapper
  (unwrap [_] (.as value clobits.sdl.Surface))))

(def
 ^{:private true}
 -place-of-get-sdl-init-video
 (.getMember polyglot-lib "_SHADOWING_GET_SDL_INIT_VIDEO"))

(clojure.core/defn
 get-sdl-init-video
 "Args:[], Ret: {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true}"
 ^long
 []
 (.asInt
  (.execute
   -place-of-get-sdl-init-video
   (clojure.core/object-array []))))

(def
 ^{:private true}
 -place-of-get-sdl-window-shown
 (.getMember polyglot-lib "_SHADOWING_GET_SDL_WINDOW_SHOWN"))

(clojure.core/defn
 get-sdl-window-shown
 "Args:[], Ret: {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true}"
 ^long
 []
 (.asInt
  (.execute
   -place-of-get-sdl-window-shown
   (clojure.core/object-array []))))

(def
 ^{:private true}
 -place-of-get-null
 (.getMember polyglot-lib "_SHADOWING_get_null"))

(clojure.core/defn
 get-null
 "Args:[], Ret: {:interface clobits.wrappers.IVoidPointerYE, \"*\" {:interface clobits.wrappers.IVoidPointerYE, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}"
 ^clobits.wrappers.IVoidPointerYE
 []
 (wrap-pointer
  (.executeVoid -place-of-get-null (clojure.core/object-array []))))

(def
 ^{:private true}
 -place-of-gen-title
 (.getMember polyglot-lib "_SHADOWING_gen_title"))

(clojure.core/defn
 gen-title
 "Args:[], Ret: {\"*\" {:ni/type org.graalvm.nativeimage.c.type.CCharPointer, :ni/wrapper clobits.wrappers.WrapPointer, :ni/unwrap .unwrap, :poly/type nil, :primitive false}, :poly/type nil, :ni/type org.graalvm.nativeimage.c.type.CCharPointer, :primitive false, :ni/wrapper clobits.wrappers.WrapPointer, :ni/unwrap .unwrap}"
 
 []
 (.execute -place-of-gen-title (clojure.core/object-array [])))

(def
 ^{:private true}
 -place-of-create-rect
 (.getMember polyglot-lib "_SHADOWING_create_rect"))

(clojure.core/defn
 create-rect
 "Args:[{:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol x} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol y} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol w} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol h}], Ret: {:interface clobits.sdl.Rect, :c-sym \"SDL_Rect\", :ni/java-wrapper \"new clobits.sdl.ni.RectWrapper\", :ni/interface clobits.sdl.ni.IRect, :ni/wrapper clobits.sdl.ni.RectWrapper, :poly/type clobits.sdl.Rect, :poly/unwrap .unwrap, :primitive false, :ni/type clobits.sdl.ni.IRect, :poly/wrapper wrap-rect, :ni/unwrap .unwrap}"
 ^clobits.sdl.Rect
 [^long x ^long y ^long w ^long h]
 (wrap-rect
  (.execute
   -place-of-create-rect
   (clojure.core/object-array [x y w h]))))

(def
 ^{:private true}
 -place-of-get-e
 (.getMember polyglot-lib "_SHADOWING_get_e"))

(clojure.core/defn
 get-e
 "Args:[], Ret: {:interface clobits.sdl.Event, :c-sym \"SDL_Event\", :ni/java-wrapper \"new clobits.sdl.ni.EventWrapper\", :ni/interface clobits.sdl.ni.IEvent, :ni/wrapper clobits.sdl.ni.EventWrapper, :poly/type clobits.sdl.Event, :poly/unwrap .unwrap, :primitive false, :ni/type clobits.sdl.ni.IEvent, :poly/wrapper wrap-event, :ni/unwrap .unwrap}"
 ^clobits.sdl.Event
 []
 (wrap-event (.execute -place-of-get-e (clojure.core/object-array []))))

(def
 ^{:private true}
 -place-of-init
 (.getMember polyglot-lib "_SHADOWING_SDL_Init"))

(clojure.core/defn
 init
 "Args:[{:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol flags}], Ret: {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true}"
 ^long
 [^long flags]
 (.asInt (.execute -place-of-init (clojure.core/object-array [flags]))))

(def
 ^{:private true}
 -place-of-poll-event
 (.getMember polyglot-lib "_SHADOWING_SDL_PollEvent"))

(clojure.core/defn
 poll-event
 "Args:[{:interface clobits.sdl.Event, :c-sym \"SDL_Event\", :ni/java-wrapper \"new clobits.sdl.ni.EventWrapper\", :ni/interface clobits.sdl.ni.IEvent, :ni/wrapper clobits.sdl.ni.EventWrapper, :poly/type clobits.sdl.Event, :poly/unwrap .unwrap, :primitive false, :arg-symbol event, :ni/type clobits.sdl.ni.IEvent, :poly/wrapper wrap-event, :annotation clobits.sdl.Event, :ni/unwrap .unwrap}], Ret: {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true}"
 ^long
 [^clobits.sdl.Event event]
 (.asInt
  (.execute
   -place-of-poll-event
   (clojure.core/object-array [(.unwrap event)]))))

(def
 ^{:private true}
 -place-of-delay
 (.getMember polyglot-lib "_SHADOWING_SDL_Delay"))

(clojure.core/defn
 delay
 "Args:[{:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol ms}], Ret: {\"*\" {:interface clobits.wrappers.IVoidPointerYE, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}, :ni/type void, :primitive true}"
 
 [^long ms]
 (.executeVoid -place-of-delay (clojure.core/object-array [ms])))

(def
 ^{:private true}
 -place-of-update-window-surface
 (.getMember polyglot-lib "_SHADOWING_SDL_UpdateWindowSurface"))

(clojure.core/defn
 update-window-surface
 "Args:[{:interface clobits.wrappers.IVoidPointerYE, \"*\" {:interface clobits.wrappers.IVoidPointerYE, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :arg-symbol window, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :annotation clobits.wrappers.IVoidPointerYE, :ni/unwrap .unwrap}], Ret: {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true}"
 ^long
 [^clobits.wrappers.IVoidPointerYE window]
 (.asInt
  (.execute
   -place-of-update-window-surface
   (clojure.core/object-array [(.unwrap window)]))))

(def
 ^{:private true}
 -place-of-get-window-surface
 (.getMember polyglot-lib "_SHADOWING_SDL_GetWindowSurface"))

(clojure.core/defn
 get-window-surface
 "Args:[{:interface clobits.wrappers.IVoidPointerYE, \"*\" {:interface clobits.wrappers.IVoidPointerYE, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :arg-symbol window, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :annotation clobits.wrappers.IVoidPointerYE, :ni/unwrap .unwrap}], Ret: {:interface clobits.sdl.Surface, :c-sym \"SDL_Surface\", :ni/java-wrapper \"new clobits.sdl.ni.SurfaceWrapper\", :ni/interface clobits.sdl.ni.ISurface, :ni/wrapper clobits.sdl.ni.SurfaceWrapper, :poly/type clobits.sdl.Surface, :poly/unwrap .unwrap, :primitive false, :ni/type clobits.sdl.ni.ISurface, :poly/wrapper wrap-surface, :ni/unwrap .unwrap}"
 ^clobits.sdl.Surface
 [^clobits.wrappers.IVoidPointerYE window]
 (wrap-surface
  (.execute
   -place-of-get-window-surface
   (clojure.core/object-array [(.unwrap window)]))))

(def
 ^{:private true}
 -place-of-map-rgb
 (.getMember polyglot-lib "_SHADOWING_SDL_MapRGB"))

(clojure.core/defn
 map-rgb
 "Args:[{:interface clobits.sdl.PixelFormat, :c-sym \"SDL_PixelFormat\", :ni/java-wrapper \"new clobits.sdl.ni.PixelFormatWrapper\", :ni/interface clobits.sdl.ni.IPixelFormat, :ni/wrapper clobits.sdl.ni.PixelFormatWrapper, :poly/type clobits.sdl.PixelFormat, :poly/unwrap .unwrap, :primitive false, :arg-symbol format, :ni/type clobits.sdl.ni.IPixelFormat, :poly/wrapper wrap-pixelformat, :annotation clobits.sdl.PixelFormat, :ni/unwrap .unwrap} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol r} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol g} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol b}], Ret: {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true}"
 ^long
 [^clobits.sdl.PixelFormat format ^long r ^long g ^long b]
 (.asInt
  (.execute
   -place-of-map-rgb
   (clojure.core/object-array [(.unwrap format) r g b]))))

(def
 ^{:private true}
 -place-of-create-window
 (.getMember polyglot-lib "_SHADOWING_SDL_CreateWindow"))

(clojure.core/defn
 create-window
 "Args:[{\"*\" {:ni/type org.graalvm.nativeimage.c.type.CCharPointer, :ni/wrapper clobits.wrappers.WrapPointer, :ni/unwrap .unwrap, :poly/type nil, :primitive false}, :poly/type nil, :ni/type org.graalvm.nativeimage.c.type.CCharPointer, :primitive false, :ni/wrapper clobits.wrappers.WrapPointer, :ni/unwrap .unwrap, :annotation nil, :arg-symbol title} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation Long, :arg-symbol x} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation Long, :arg-symbol y} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation Long, :arg-symbol w} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation Long, :arg-symbol h} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation Long, :arg-symbol flags}], Ret: {:interface clobits.wrappers.IVoidPointerYE, \"*\" {:interface clobits.wrappers.IVoidPointerYE, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}"
 ^clobits.wrappers.IVoidPointerYE
 [title ^Long x ^Long y ^Long w ^Long h ^Long flags]
 (wrap-pointer
  (.execute
   -place-of-create-window
   (clojure.core/object-array [title x y w h flags]))))

(def
 ^{:private true}
 -place-of-fill-rect
 (.getMember polyglot-lib "_SHADOWING_SDL_FillRect"))

(clojure.core/defn
 fill-rect
 "Args:[{:interface clobits.sdl.Surface, :c-sym \"SDL_Surface\", :ni/java-wrapper \"new clobits.sdl.ni.SurfaceWrapper\", :ni/interface clobits.sdl.ni.ISurface, :ni/wrapper clobits.sdl.ni.SurfaceWrapper, :poly/type clobits.sdl.Surface, :poly/unwrap .unwrap, :primitive false, :arg-symbol dst, :ni/type clobits.sdl.ni.ISurface, :poly/wrapper wrap-surface, :annotation clobits.sdl.Surface, :ni/unwrap .unwrap} {:interface clobits.sdl.Rect, :c-sym \"SDL_Rect\", :ni/java-wrapper \"new clobits.sdl.ni.RectWrapper\", :ni/interface clobits.sdl.ni.IRect, :ni/wrapper clobits.sdl.ni.RectWrapper, :poly/type clobits.sdl.Rect, :poly/unwrap .unwrap, :primitive false, :arg-symbol rect, :ni/type clobits.sdl.ni.IRect, :poly/wrapper wrap-rect, :annotation clobits.sdl.Rect, :ni/unwrap .unwrap} {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true, :annotation long, :arg-symbol color}], Ret: {:ni/type int, :poly/wrapper .asInt, :poly/type int, :primitive true}"
 ^long
 [^clobits.sdl.Surface dst ^clobits.sdl.Rect rect ^long color]
 (.asInt
  (.execute
   -place-of-fill-rect
   (clojure.core/object-array [(.unwrap dst) (.unwrap rect) color]))))

(def
 ^{:private true}
 -place-of-quit
 (.getMember polyglot-lib "_SHADOWING_SDL_Quit"))

(clojure.core/defn
 quit
 "Args:[], Ret: {\"*\" {:interface clobits.wrappers.IVoidPointerYE, :ni/java-wrapper \"new clobits.wrappers.WrapVoid\", :ni/interface clobits.wrappers.IVoidPointer, :ni/wrapper clobits.wrappers.WrapVoid, :poly/type clobits.wrappers.IVoidPointerYE, :poly/unwrap .unwrap, :primitive false, :ni/type org.graalvm.nativeimage.c.type.VoidPointer, :poly/wrapper wrap-pointer, :ni/unwrap .unwrap}, :ni/type void, :primitive true}"
 
 []
 (.executeVoid -place-of-quit (clojure.core/object-array [])))

