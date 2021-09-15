package fastcampus.aop.part3.chapter04

import fastcampus.aop.part3.chapter04.service.MusicDto
import fastcampus.aop.part3.chapter04.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
)


fun MusicDto.mapper(): PlayerModel = PlayerModel(
    playMusicList = musics.mapIndexed { index, musicEntity ->
            musicEntity.mapper(index.toLong())
    }
)