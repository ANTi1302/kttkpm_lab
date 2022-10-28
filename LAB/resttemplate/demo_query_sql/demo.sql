SELECT nhanvien.MaNV
FROM     chungnhan INNER JOIN
                  maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV
				  where maybay.Loai like '%Boeing%' or maybay.Loai like '%Airbus%'
GROUP BY nhanvien.MaNV
select MaMB FROM     chungnhan INNER JOIN
                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV where nhanvien.Ten like '%Nguyen%'


select * from chuyenbay where DoDai < (select TamBay from maybay where Loai like 'Airbus A320')

SELECT nhanvien.Ten
FROM     maybay INNER JOIN
                  chungnhan ON maybay.MaMB = chungnhan.MaMB INNER JOIN
                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV
				   where maybay.Loai like '%Boeing%' 
GROUP BY nhanvien.Ten



SELECT maybay.MaMB, maybay.Loai,count( nhanvien.MaNV)
FROM     chungnhan INNER JOIN
                  maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN
                  nhanvien ON chungnhan.MaNV = nhanvien.MaNV
GROUP BY maybay.MaMB, maybay.Loai


select * from chuyenbay where (GioDi-GioDen)<GioDi
;with temp
AS
(
    SELECT t.MaCB,
    CAST(t.GioDi AS time(7)) Arrival,
    CAST(t.GioDen AS time(7)) Departure
    FROM chuyenbay t

)
SELECT MaCB, CONVERT(time(7),
    CAST(Departure AS Datetime) 
    - CAST(Arrival AS Datetime)
    )
FROM temp

select sum(Luong) from nhanvien 
select GaDi,count(GaDi )from chuyenbay group by GaDi
select GaDi from chuyenbay
select GaDen from chuyenbay
select * from chungnhan
select nhanvien.MaNV,Ten,Luong from nhanvien full outer join chungnhan on nhanvien.MaNV=chungnhan.MaNV
where chungnhan.MaNV is null

select GaDi,COUNT(GaDi) from chuyenbay where GioDi <'12:00:00' group by GaDi