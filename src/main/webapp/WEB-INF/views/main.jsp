<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

<%@ include file="src\main\webapp\WEB-INF\views\Header.jsp" %>

    <body>
        <%@ include file="Header.jsp" %>
        <!-- Menu -->

        <div style="position: relative;">
            <img class="w-100" src="img/다.PNG" alt="" height="700">
            <div style="position: absolute; top: 55%; left: 25%; transform: translate(-50%, -50%);">
                <p
                    style="font-size: 26px; font-weight: bold; color: white; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5); white-space: nowrap;">
                    다이어트를 원하는 당신</p>
                <p
                    style="font-size: 26px; font-weight: bold; color: white; text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5); white-space: nowrap;">
                    설문조사를 통해 알맞은 보조제를 찾아보세요!</p>
            </div>
            <a href="survey.html">
                <button
                    style="position: absolute; top: 70%; left: 19%; transform: translate(-50%, -50%); background-color: #5B9BD5; color: white; border: none; padding: 20px 40px; font-size: 16px; border-radius: 10px; font-weight: bold;">
                    어떤 보조 식품이 나에게 맞을까요?
                </button>
            </a>
        </div>

        <!--footers-->
        <footers class="p-5 d-flex justify-content-between align-items-center"
            style="background-color: #5B9BD5; font-size: 0.8rem">
            <div class="row">
                <div class="">
                    <div>
                        <ul class="list-unstyled m-0">
                            <li class="pt-1">
                                대표번호 : 080-513-5420 (업무시간 : 09:00-18:00 월~금) 주말,
                                공휴일 휴무
                            </li>
                            <li class="pt-1">
                                <span class="pe-3">대표자 : 김상아</span>
                                <span>주소 : 서울특별시 구로동 디지털로34길 27 대륭포스트타워 3차 1106호</span>
                            </li>
                            <li class="pt-1">
                                <span>법인명 : (주)0124</span>
                                <span>사업자 등록정보 : 96-979686</span>
                            </li>
                            <li class="pt-1">
                                <span>호스팅 : (주)0124</span>
                                <span>E-MAIL : diet@gmail.com</span>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row">
                <img src="img/logo2.png" alt="logo" height="130rem" />
            </div>
            </footer>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

    </html>