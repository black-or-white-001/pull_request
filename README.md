# OSSDP-Lab2 修改14

学号：2022211987

修改思路：
将 segments 的声明保留在类级别，删除初始化
将 segId === SEG_COUNT 更改为 segId == SEG_COUNT
将 segments(segId) = 0; 更改为 segments[segId] = 0