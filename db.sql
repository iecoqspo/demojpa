CREATE TABLE [dbo].[Department](
	[DepartmentID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](50) NULL,
	[Budget] [money] NOT NULL,
	[StartDate] [datetime] NOT NULL,
	[InstructorID] [int] NULL)

INSERT INTO master.dbo.Department
(Name, Budget, StartDate, InstructorID )
VALUES('KKK', 10, getdate(), 0)

INSERT INTO master.dbo.Department
(Name, Budget, StartDate, InstructorID )
VALUES('HHH', 20, getdate(), 0)