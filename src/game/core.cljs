(ns ^:figwheel-always game.core
    (:require [game.boot :refer [Boot]]
              [game.preload :refer [Preload]]
              [game.title-screen :refer [TitleScreen]]
              [game.main-game :refer [MainGame]]))

(enable-console-print!)

(defonce game (js/Phaser.Game. 800 600 js/Phaser.AUTO "game-container"))

(defn main []
  (.. game -state (add "boot" Boot))
  (.. game -state (add "preload" Preload))
  (.. game -state (add "titleScreen" TitleScreen))
  (.. game -state (add "mainGame" MainGame))
  (.. game -state (start "boot")))

(main)
