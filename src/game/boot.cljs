(ns game.boot)

(defn Boot [game]
  (let []
    (reify Object
      (preload [this]
        ())
      (create [this]
        (set! (.. game -scale -pageAlignHorizontally) true)
        (set! (.. game -scale -pageAlignVertically) true)
        (.. game -state (start "preload"))))))
