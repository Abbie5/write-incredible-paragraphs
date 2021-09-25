cmake_minimum_required(VERSION 3.20)
project(write_incredible_paragraphs)

set(CMAKE_CXX_STANDARD 14)
set(CMAKE_AUTOMOC ON)
set(CMAKE_AUTORCC ON)
set(CMAKE_AUTOUIC ON)

find_package(Qt6 COMPONENTS Core REQUIRED)

add_executable(write_incredible_paragraphs main.cpp)
target_link_libraries(write_incredible_paragraphs Qt::Core)