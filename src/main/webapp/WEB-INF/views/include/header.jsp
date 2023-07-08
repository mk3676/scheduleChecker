<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, user-scalable=no"
    />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <title>웹케줄러</title>
    <script src="https://code.jquery.com/jquery-3.6.3.js"></script>
    <script>
      $(document).ready(function () {
        // 로그인 화면으로 이동
        $("#loginButton").click(function () {
          location.href = "/login";
        });

        // 회원가입 화면으로 이동
        $("#registerButton").click(function () {
          location.href = "/register";
        });
      });
    </script>
  </head>
  <body>
    <div class="container">
      <header
        class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom"
      >
        <a
          href="/"
          class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none"
        >
          <svg
            class="bi me-2"
            width="40"
            height="32"
            role="img"
            aria-label="Bootstrap"
          >
            <use xlink:href="#bootstrap" />
          </svg>
        </a>

        <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
          <li>
            <a href="/main" class="nav-link px-2 link-secondary">메인화면</a>
          </li>
          <li><a href="#" class="nav-link px-2 link-dark">웹케줄러</a></li>
          <li><a href="#" class="nav-link px-2 link-dark">커뮤니티</a></li>
        </ul>

        <div class="col-md-3 text-end">
          <button
            type="button"
            class="btn btn-outline-primary me-2"
            id="loginButton"
          >
            로그인
          </button>
          <button type="button" class="btn btn-primary" id="registerButton">
            회원가입
          </button>
        </div>
      </header>
    </div>

