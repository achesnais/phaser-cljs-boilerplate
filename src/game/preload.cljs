(ns game.preload)

(defn Preload [game]
  (let []
    (reify Object
      (preload [this]
        #_(.. game -load (image "some-asset" "assets/some-asset.png")))
      (create [this]
        #_(.. game -add (sprite 0 0 "some-asset"))))))
