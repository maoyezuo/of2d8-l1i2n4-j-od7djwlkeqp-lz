/* 基础数据备份，用于重新开服。 */

DROP TABLE IF EXISTS `t_ball_club_backup`;
DROP TABLE IF EXISTS `t_ball_league_backup`;
DROP TABLE IF EXISTS `t_ball_nation_backup`;
DROP TABLE IF EXISTS `t_ball_player_backup`;
CREATE TABLE t_ball_club_backup SELECT * FROM t_ball_club;
CREATE TABLE t_ball_league_backup SELECT * FROM t_ball_league;
CREATE TABLE t_ball_nation_backup SELECT * FROM t_ball_nation;
CREATE TABLE t_ball_player_backup SELECT * FROM t_ball_player;
