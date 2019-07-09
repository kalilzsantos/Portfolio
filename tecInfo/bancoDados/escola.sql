-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.1.53-community-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para escola
CREATE DATABASE IF NOT EXISTS `escola` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `escola`;


-- Copiando estrutura para tabela escola.aluno
CREATE TABLE IF NOT EXISTS `aluno` (
  `id_professor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `id_curso` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_professor`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela escola.aluno: 0 rows
DELETE FROM `aluno`;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` (`id_professor`, `nome`, `telefone`, `email`, `id_curso`) VALUES
	(1, 'NATHANAEL SILVA', '(19)3641-2390', 'nathanael@hotmail.com', 1),
	(2, 'JOAQUIM LIMA', '(19)3641-5637', 'joaquim@hotmail.com', 3),
	(3, 'FABIANA LOPES', '(19)3641-2830', 'fabiana@hotmail.com', 4),
	(4, 'MARIO CHARADA', '(19)3641-3125', 'mario@hotmail.com', 6),
	(5, 'JOÃO FEIJÃO', '(19)3641-7943', 'joaofeijao@hotmail.com', 2),
	(6, 'GUILHERME ANTUNES', '(19)3641-2856', 'guilherme@hotmail.com', 5);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;


-- Copiando estrutura para tabela escola.curso
CREATE TABLE IF NOT EXISTS `curso` (
  `id_curso` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_curso`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela escola.curso: 0 rows
DELETE FROM `curso`;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` (`id_curso`, `descricao`) VALUES
	(1, 'INFORMÁTICA'),
	(2, 'INFORMÁTICA PARA INTERNET'),
	(3, 'MANUTENÇÃO E SUPORTE EM INFORMÁTICA'),
	(4, 'ADMINISTRAÇÃO'),
	(5, 'AGROINDÚSTRIA'),
	(6, 'RECURSOS HUMANOS');
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;


-- Copiando estrutura para tabela escola.professor
CREATE TABLE IF NOT EXISTS `professor` (
  `id_professor` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `telefone` varchar(14) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `id_curso` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_professor`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela escola.professor: 0 rows
DELETE FROM `professor`;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
INSERT INTO `professor` (`id_professor`, `nome`, `telefone`, `email`, `id_curso`) VALUES
	(1, 'JOÃO DA SILVA', '(19)3641-1234', 'joao@hotmail.com', 2),
	(2, 'PEDRO PEREIRA', '(19)3641-1122', 'pedro@hotmail.com', 4),
	(3, 'LUIZA DA SILVA', '(19)3641-2211', 'luiza@hotmail.com', 5),
	(4, 'NATALIA GONÇALVES', '(19)3641-1212', 'natalia@hotmail.com', 3),
	(5, 'JONATAS FERREIRA', '(19)3641-2121', 'jonatas@hotmail.com', 1),
	(6, 'MARIA ALICE DUTRA', '(19)3641-2143', 'mariaalice@hotmail.com', 6);
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
