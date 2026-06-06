# VanillaTerra (1.21+)
[![community](https://go.buildtheearth.net/community-shield)](https://github.com/buildtheearth) [![](https://img.shields.io/github/release/vaporrrr/VanillaTerra.svg)](https://github.com/vaporrrr/VanillaTerra/releases/latest "Latest release")

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

# Offset added to the height display and when a player specifies a height in /tpll command
# With an offset of -1024, the true zero altitude on server will be -1024.
HeightOffset: 0
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
