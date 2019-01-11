-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th1 11, 2019 lúc 10:14 SA
-- Phiên bản máy phục vụ: 5.7.17-log
-- Phiên bản PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `project`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `admin`
--

CREATE TABLE `admin` (
  `idad` varchar(45) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `admin`
--

INSERT INTO `admin` (`idad`, `user`, `pass`) VALUES
('1', 'admin', 'sa12345');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `diem`
--

CREATE TABLE `diem` (
  `idlop` varchar(45) NOT NULL,
  `mon` varchar(45) DEFAULT NULL,
  `idmon` varchar(45) NOT NULL,
  `idsv` varchar(45) NOT NULL,
  `diem15` float DEFAULT NULL,
  `diem45` float DEFAULT NULL,
  `diemthi` float DEFAULT NULL,
  `tongket` float DEFAULT NULL,
  `ketqua` varchar(45) DEFAULT NULL,
  `idgv` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `diem`
--

INSERT INTO `diem` (`idlop`, `mon`, `idmon`, `idsv`, `diem15`, `diem45`, `diemthi`, `tongket`, `ketqua`, `idgv`) VALUES
('CNTT1', 'Java1', 'JV1', 'sv01', 5, 6, 8, 6, 'Đạt', 'GV01'),
('CNTT2', 'Java2', 'JV2', 'sv02', 7, 8, 1, 4, 'Không đạt', 'GV02');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giaovien`
--

CREATE TABLE `giaovien` (
  `idgv` varchar(45) NOT NULL,
  `hoten` varchar(45) DEFAULT NULL,
  `idmon` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL,
  `idlop` varchar(45) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `gioitinh` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `sdt` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `giaovien`
--

INSERT INTO `giaovien` (`idgv`, `hoten`, `idmon`, `idkhoa`, `idlop`, `ngaysinh`, `gioitinh`, `email`, `sdt`, `pass`) VALUES
('GV01', 'Nguyễn Hòa Nhập', 'JV1', 'CNTT', 'CNTT1', '2019-01-01', 'Nam', 'hoanhap@gmail.com', '0908990890', '123456789'),
('GV02', 'Hong Thi Yen', 'JV2', 'CNTT', 'CNTT2', '2019-01-02', 'Nữ', 'yen@gmail.com', '0909888777', '1234567');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giaovu`
--

CREATE TABLE `giaovu` (
  `idgvu` varchar(45) NOT NULL,
  `user` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `giaovu`
--

INSERT INTO `giaovu` (`idgvu`, `user`, `pass`) VALUES
('GVU01', 'DuongThiLieu', '12345678'),
('GVU02', 'LyThuThao', '12345678');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khoa`
--

CREATE TABLE `khoa` (
  `idkhoa` varchar(45) NOT NULL,
  `khoa` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `khoa`
--

INSERT INTO `khoa` (`idkhoa`, `khoa`) VALUES
('CNTT', 'Công nghệ thông tin');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lop`
--

CREATE TABLE `lop` (
  `idlop` varchar(45) NOT NULL,
  `lop` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL,
  `khoahoc` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `lop`
--

INSERT INTO `lop` (`idlop`, `lop`, `idkhoa`, `khoahoc`) VALUES
('CNTT1', 'Công nghệ thông tin 1', 'CNTT', '5'),
('CNTT2', 'Công nghệ thông tin 2', 'CNTT', '9'),
('CNTT3', 'Công nghệ thông tin 3', 'CNTT', '4'),
('CNTT4', 'Công nghệ thông tin 4', 'CNTT', '8');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `mon`
--

CREATE TABLE `mon` (
  `idmon` varchar(45) NOT NULL,
  `mon` varchar(45) DEFAULT NULL,
  `tinchi` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `mon`
--

INSERT INTO `mon` (`idmon`, `mon`, `tinchi`, `idkhoa`) VALUES
('C', 'C# nâng cao', '15', 'CNTT'),
('CSS', 'Css cơ bản', '12', 'CNTT'),
('JV1', 'Java1', '8', 'CNTT'),
('JV2', 'Java2', '7', 'CNTT'),
('PHP', 'Php cơ bản', '10', 'CNTT'),
('WEB', 'Lập trình web', '10', 'CNTT');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sinhvien`
--

CREATE TABLE `sinhvien` (
  `idsv` varchar(45) NOT NULL,
  `hoten` varchar(45) DEFAULT NULL,
  `idlop` varchar(45) DEFAULT NULL,
  `hedt` varchar(45) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `diachi` varchar(45) DEFAULT NULL,
  `gioitinh` varchar(45) DEFAULT NULL,
  `sdt` varchar(45) DEFAULT NULL,
  `idkhoa` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `sinhvien`
--

INSERT INTO `sinhvien` (`idsv`, `hoten`, `idlop`, `hedt`, `ngaysinh`, `diachi`, `gioitinh`, `sdt`, `idkhoa`) VALUES
('sv01', 'Nguyễn Thị Bé', 'CNTT1', 'Đại Học', '1990-02-12', 'Đà Nẵng', 'Nữ', '0909765789', 'CNTT'),
('sv02', 'Nguyễn Văn Nam', 'CNTT2', 'Cao Đẳng', '1991-12-05', 'Hà Nội', 'Nam', '0998777666', 'CNTT');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`idad`);

--
-- Chỉ mục cho bảng `diem`
--
ALTER TABLE `diem`
  ADD KEY `FK_Mon_idx` (`idmon`),
  ADD KEY `FK_SV_idx` (`idsv`);

--
-- Chỉ mục cho bảng `giaovien`
--
ALTER TABLE `giaovien`
  ADD PRIMARY KEY (`idgv`),
  ADD KEY `FK_IDmon_idx` (`idmon`);

--
-- Chỉ mục cho bảng `giaovu`
--
ALTER TABLE `giaovu`
  ADD PRIMARY KEY (`idgvu`);

--
-- Chỉ mục cho bảng `khoa`
--
ALTER TABLE `khoa`
  ADD PRIMARY KEY (`idkhoa`);

--
-- Chỉ mục cho bảng `lop`
--
ALTER TABLE `lop`
  ADD PRIMARY KEY (`idlop`);

--
-- Chỉ mục cho bảng `mon`
--
ALTER TABLE `mon`
  ADD PRIMARY KEY (`idmon`),
  ADD KEY `FK_KhoaHoc_idx` (`idkhoa`);

--
-- Chỉ mục cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`idsv`),
  ADD KEY `FK_Lop_idx` (`idlop`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `diem`
--
ALTER TABLE `diem`
  ADD CONSTRAINT `FK_Mon` FOREIGN KEY (`idmon`) REFERENCES `mon` (`idmon`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_SV` FOREIGN KEY (`idsv`) REFERENCES `sinhvien` (`idsv`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `giaovien`
--
ALTER TABLE `giaovien`
  ADD CONSTRAINT `FK_IDmon` FOREIGN KEY (`idmon`) REFERENCES `mon` (`idmon`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `mon`
--
ALTER TABLE `mon`
  ADD CONSTRAINT `FK_KhoaHoc` FOREIGN KEY (`idkhoa`) REFERENCES `khoa` (`idkhoa`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Các ràng buộc cho bảng `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD CONSTRAINT `FK_Lop` FOREIGN KEY (`idlop`) REFERENCES `lop` (`idlop`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
