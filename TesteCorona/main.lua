-----------------------------------------------------------------------------------------
--
-- main.lua
--
-----------------------------------------------------------------------------------------

local physics = require("physics")

physics.start()
physics.setGravity(0, 9.8)

local background = display.newImage("background.png", true)

local base = display.newImage("base.png")
base.y = display.contentHeight - base.stageHeight / 2
physics.addBody(base, "static")

local icone = display.newImage("icone.png")
icone.rotation = 2.0

local circulo = display.newCircle(100, 100, 0)

physics.addBody(icone)
