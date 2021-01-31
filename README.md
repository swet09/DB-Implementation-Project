# DB-Implementation-Project
Introduction
The project's aim is to evaluate a single relational system such as PostgreSQL by changing system parameters and varying relation or data size and through this project we have an increased understanding of database performance and improve programming experience with a RDBMS system such as PostgreSQL.

Brief description of your data generation process 
The main objective of part 1 is to generate data based on the Wiscosin Benchmark specification. The orginal benchmark was composed of three relations (onektup, tenktup1 and tenktup2), each relation was composed of the thirteen integer attributes and three 52 byte string attributes. The three relations or data are generated using a Java. The 'main.java' file consists of the main code for data generation and the ".java" file in the dao folder consists of the Database connection configurations. The generated data files are placed in a folder named ‘ ’.  

System we are working with and why 
The database system we have chosen to work with is PostgreSQL and for data generation we have decided to write code in the programming language Java, because of our prior knowledge and experience with both PostgreSQL and Java is why we decided to go with them. We plan to develop benchmark comparisons using queries from Wisconsin Benchmark and evaluate against a progress system. We have decided to use a single database system as we want to keep the other parameters such as  main memory, OS load and processor speed constant while testing the database against different parameter values and optimizer options. 

Validation that data is loaded into the system
After successful execution of the java code, data is generated as CSV files in ' ' folder as a result of select queries from Postgres.

Lessons learned or issues encountered
The major learnings for this project part 1 was from the Wisconsin Benchmark paper. The paper provided great insight into designing a specification. The information provided by the Benchmark Relation Generator was very useful in generating data files. The important takeways from the paper were, how the queries in the benchmark should test the performance of the major components of a relational database system and the why the semantics and statistics of the underlying relations should be well understood so that it is easy to add new queries and to their behavior. Through this project we learned to generate relations in pgadmin and populate them through java.


