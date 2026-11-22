# VanillaTerra (1.21+)
[![community](https://go.buildtheearth.net/community-shield)](https://github.com/buildtheearth) [![](https://img.shields.io/github/release/Dmistass/VanillaTerra.svg)](https://github.com/Dmistass/VanillaTerra/releases/latest "Latest release")

For use on a 1.21+ BTE vanilla Minecraft server.  
Used on the TeamCIS Minecraft server.  
Uses [terraminusminus](https://github.com/SmylerMC/terraminusminus).

Supports only BTE default settings/projection.  
Supports: [Spigot](https://www.spigotmc.org/) / [PaperMC](https://papermc.io/) / downstream forks.  

Plugin tested on: 1.21.4, 1.21.8  
(Should works on any version higher 1.21)  

## Config:
``` yml
# Map services used when a player uses command '/where' Options are Google, Yandex, OSM
MapLinks:
  - Google
  - Yandex
  - OSM

# Whether to show the player's height in the action bar
ShowHeightInActionBar: false

# Offset for x, y, z when teleporting, configurable per world.
# Key is world name, value contains x, y, z offsets.
# If a world is not listed, all offsets default to 0.
# With y offset of -1024, the true zero altitude on server will be -1024.
Offset:
  world:
    x: 0
    y: 0
    z: 0
  world_plus:
    x: 0
    y: 0
    z: 0
```


## Commands:
### /tpll
```
Permission: vt.tpll
Description: Teleports player to latitude longitude coordinates.
```
### /distortion
```
Permission: vt.terra.distortion
Description: Returns amount of distortion due to the projection at the player's location.
```
### /where
```
Permission: vt.terra.where
Description: Returns your location in relation to the real world.
```
### /vt-reload
```
Permission: vt.reload
Description: Reloads plugin config.
```
